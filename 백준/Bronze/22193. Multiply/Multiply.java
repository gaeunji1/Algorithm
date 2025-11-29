import java.io.*;
import java.util.*;

public class Main {
    // 복소수 (double)
    static class Complex {
        double re, im;
        Complex(double re, double im) { this.re = re; this.im = im; }
        Complex add(Complex o) { return new Complex(this.re + o.re, this.im + o.im); }
        Complex sub(Complex o) { return new Complex(this.re - o.re, this.im - o.im); }
        Complex mul(Complex o) {
            return new Complex(this.re * o.re - this.im * o.im,
                               this.re * o.im + this.im * o.re);
        }
        Complex div(double v) { return new Complex(this.re / v, this.im / v); }
    }

    static void fft(Complex[] a, boolean invert) {
        int n = a.length;

        // bit-reversal permutation
        for (int i = 1, j = 0; i < n; i++) {
            int bit = n >> 1;
            for (; (j & bit) != 0; bit >>= 1) j ^= bit;
            j ^= bit;
            if (i < j) {
                Complex tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }

        for (int len = 2; len <= n; len <<= 1) {
            double ang = 2 * Math.PI / len * (invert ? -1 : 1);
            Complex wlen = new Complex(Math.cos(ang), Math.sin(ang));

            for (int i = 0; i < n; i += len) {
                Complex w = new Complex(1, 0);
                int half = len >> 1;
                for (int j = 0; j < half; j++) {
                    Complex u = a[i + j];
                    Complex v = a[i + j + half].mul(w);
                    a[i + j] = u.add(v);
                    a[i + j + half] = u.sub(v);
                    w = w.mul(wlen);
                }
            }
        }

        if (invert) {
            for (int i = 0; i < n; i++) a[i] = a[i].div(n);
        }
    }

    static long[] convolutionBase10(String A, String B) {
        int nA = A.length(), nB = B.length();
        int n = 1;
        while (n < nA + nB) n <<= 1;

        Complex[] fa = new Complex[n];
        Complex[] fb = new Complex[n];
        for (int i = 0; i < n; i++) {
            fa[i] = new Complex(0, 0);
            fb[i] = new Complex(0, 0);
        }

        // 뒤집어서 (LSB부터) 채움
        for (int i = 0; i < nA; i++) fa[i].re = A.charAt(nA - 1 - i) - '0';
        for (int i = 0; i < nB; i++) fb[i].re = B.charAt(nB - 1 - i) - '0';

        fft(fa, false);
        fft(fb, false);
        for (int i = 0; i < n; i++) fa[i] = fa[i].mul(fb[i]);
        fft(fa, true);

        long[] res = new long[n];
        for (int i = 0; i < n; i++) res[i] = Math.round(fa[i].re);
        return res;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String A = br.readLine().trim();
        String B = br.readLine().trim();

        if (A.equals("0") || B.equals("0")) {
            System.out.println("0");
            return;
        }

        long[] conv = convolutionBase10(A, B);

        // carry 처리 (base 10)
        ArrayList<Integer> digits = new ArrayList<>(conv.length + 10);
        long carry = 0;
        for (int i = 0; i < conv.length; i++) {
            long cur = conv[i] + carry;
            int digit = (int)(cur % 10);
            carry = cur / 10;
            digits.add(digit);
        }
        while (carry > 0) {
            digits.add((int)(carry % 10));
            carry /= 10;
        }

        // 앞쪽(가장 높은 자리)의 0 제거
        int i = digits.size() - 1;
        while (i > 0 && digits.get(i) == 0) i--;

        StringBuilder sb = new StringBuilder(i + 1);
        for (; i >= 0; i--) sb.append(digits.get(i));
        System.out.println(sb.toString());
    }
}

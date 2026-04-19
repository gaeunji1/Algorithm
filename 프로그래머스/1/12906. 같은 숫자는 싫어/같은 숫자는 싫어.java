import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        // 스택 생성
        Stack<Integer> stack = new Stack<>();
        
        // arr 순회
        for(int i : arr){
            // 스택이 비어있거나 직전 값이 다르면 u 넣기
            if(stack.empty() || !stack.peek().equals(i)){
                stack.push(i);
            }
        }

        return stack.stream().mapToInt(i -> i).toArray();
    }
}
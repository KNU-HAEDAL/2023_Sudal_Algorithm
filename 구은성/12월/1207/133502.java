import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> newIngredient = new ArrayList<>();
        
        for(int food : ingredient) {
            newIngredient.add(food);
            int size = newIngredient.size();
            if(size >= 4) {
                if(newIngredient.get(size - 1) == 1
                  && newIngredient.get(size - 2) == 3
                  && newIngredient.get(size - 3) == 2
                  && newIngredient.get(size - 4) == 1) {
                    answer++;
                    newIngredient.remove(size - 1);
                    newIngredient.remove(size - 2);
                    newIngredient.remove(size - 3);
                    newIngredient.remove(size - 4);
                }
            }
        }
        return answer;
    }
}
package leetcode.Med;

public class Container_With_Most_Water {
    public int maxArea(int[] height) {
        int left = 0; 
        int right = height.length - 1;
        int rectangle = 0;  

        while(left < right){
            int area = (right - left) * Math.min(height[left], height[right]);
            rectangle = Math.max(area, rectangle);
            if(height[left] < height[right]){
                left++;
            }else if(height[left] > height[right]){
                right--;
            }else{
                left++;
                right--;
            }
        }
        return rectangle;
    }
}

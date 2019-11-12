import java.util.ArrayList;

public class FindAllOccurrance {
    /**
     * Return an array of integers that occurs in the ArrayList taken in
     * @param list  A non-null ArrayList, type Integer
     * @return      An array of integers that occur in the ArrayList taken in.
     *              If the size of the ArrayList equals zero, return an array containing -1
     */
    public int[] findAllOccurance(ArrayList<Integer> list){
        int[] integers;
        if(list.size()==0){
            integers = new int[1];
            integers[0] = -1;
            return integers;
        }
        ArrayList<Integer> nums = new ArrayList<>();
        for(Integer i:list){
            nums.add(i);
        }
        integers = new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            integers[i]=nums.get(i);
        }
        return integers;
    }
}

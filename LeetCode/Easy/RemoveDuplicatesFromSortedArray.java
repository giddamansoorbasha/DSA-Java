class RemoveDuplicatesFromSortedArray{

    public int removeDuplicates(int[] array){

        if (array == null || array.length == 0) return 0;
        int j=0;

        for (int i=1;i<array.length;i++){
            if (array[i] != array[j]){
                j++;
                array[j] = array[i];
            }
        }

        for (int i=0;i<=j;i++){
            System.out.print(array[i]+" ");
        }return j+1;
    }

}
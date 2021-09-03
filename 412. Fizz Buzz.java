class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> stringArray = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            if(i%3 == 0 && i%5 == 0)
                stringArray.add("FizzBuzz");
            else if(i%3 == 0)
                stringArray.add("Fizz");
            else if(i%5 == 0)
                stringArray.add("Buzz");
            else
                stringArray.add(Integer.toString(i));
        }
        return stringArray;
    }
}

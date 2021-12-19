public class Main
{
	public static void main(String[] args) 
	{
        double[] arr = {0.0, 0.2, 1.0, 0.5, 3.0, 4.5};
        rescale(arr);
        // print
        for(int i = 0; i<arr.length; i++)
            System.out.println(arr[i]);
}
	
	public static void rescale(double[] arr)
	{
	    double min = min(arr);
	    double max = max(arr);
	    double difference = max - min;
	    
	    for(int i = 0; i<arr.length; i++)
	    {
	        if(isBetweenZeroAndOne(arr[i]))
	        {
	            arr[i] -= min;
	            arr[i] /= difference;
	        }
	    }
	}
	
	public static double min(double[] arr) {
        double min = arr[0];
        for(int i =1; i<arr.length;i++)
        {
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    } 
    
    public static double max(double[] arr) {
        double max = arr[0];
        for(int i =1; i<arr.length;i++)
        {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    } 
    
    public static boolean isBetweenZeroAndOne(double value)
    {
        if(value >= 0 && value <=1)
            return true;
        else
        return false;
    }
}

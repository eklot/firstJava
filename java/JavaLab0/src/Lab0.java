public class Lab0 {
    // S = a*a square of rect
    public float beginTask(float a){return a*a;}
    // find full Tons in kilograms M
    public int integerTask(int M){return M/1000;}
    // is A equals or not
    public boolean booleanTask(int A) { return A/2 == 0; }
    public int ifTask(int A){ return (A>=0)? A+1 : A - 2; }
    public String caseTask(int K)
    {
        switch(K)
        {
            case 1: return "плохо";
            case 2: return "нуудовлетворительно";
            case 3: return "удовлетворительно";
            case 4: return "хорошо";
            case 5: return "отлично";
            default: return "ошибка";
        }
    }
    // 1 + X/1! + X/2! + ... + X/N!;
    public double forTask(float X, int N)
    {
        double rezSum = 1; // zero step
        long f = 1; // f - stends for factorial
        for(int i = 1; i <= N; ++i)
        {
            f*=i;
            rezSum+=X/f;
        }
        return rezSum;
    }
    public int whileTask(int A,int B)
    {
        int step = B;
        int count = 0;
        while(A>B)
        {
            B+=step;
            count++;
        }
        return count;
    }
    public int arrayTask(int[] arr)
    {
        for(int i = arr.length-2; i >= 1; --i)
        {
            // A0 < A[k] < A[10]
            // first and lest ellement is non taken becose the expresion whoun't be true in this cases
            if(arr[0]<arr[i] && arr[i] < arr[arr.length-1])
                return i+1;
        }
        return 0;
    }

    public void matrixTask(float[][] arr,int k1, int k2)
    {
        for(int i = 0; i < arr.length; ++i)
        {
            float temp = arr[k1][i];
            arr[k1][i] = arr[k2][i];
            arr[k2][i] = temp;
        }
    }
}

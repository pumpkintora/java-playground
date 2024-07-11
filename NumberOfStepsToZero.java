public class NumberOfStepsToZero {
    public static void main(String[] args) {
        System.out.println(EfficientCountStepsToZero("011100"));
        System.out.println(EfficientCountStepsToZero("1".repeat(400000)));
    }

    public static int EfficientCountStepsToZero(String S)
    {
        String newString = RemoveLeadingZeros(S);
        int count = 0;
        for (int i = newString.length() - 1; i >= 0; i--)
        {
            if (newString.charAt(i) == '1')
            {
                count+=2;
            }
            else
            {
                count++;
            }
        }
        return count - 1;
    }

    private static String RemoveLeadingZeros(String S)
    {
        char[] letter = S.toCharArray();
        for (int i = 0; i < letter.length; i++)
        {
            if (letter[i] == '1')
            {
                break;
            }
            letter[i] = ' ';
        }
        return new String(letter).trim();
    }
}

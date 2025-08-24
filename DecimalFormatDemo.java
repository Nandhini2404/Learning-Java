import java.text.DecimalFormat;

public class DecimalFormatDemo
{
    public static void main(String[] args)
    {
        double amount = 3000;
        DecimalFormat df = new DecimalFormat("#,#00.00");
        String form=df.format(amount);
        System.out.println(form);
    }
}
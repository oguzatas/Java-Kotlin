import java.util.Date;

public class App1 {

    public static void main(String[] args)
    {
        GeneralEntityService generalEntityService = new GeneralEntityService();

        Date firstdate = new Date();
        Doc document1 = generalEntityService.findDocById(1L);
        Date lastdate = new Date();

        Long difference = getDifference(firstdate,lastdate);

        System.out.println(document1);
        System.out.println(difference);

        Date firstdate2 = new Date();
        Doc document2 = generalEntityService.findDocById(2L);
        Date lastdate2 = new Date();

        Long difference2 = getDifference(firstdate2,lastdate2);



        System.out.println(document2);
        System.out.println(difference2);

        Date firstdate3 = new Date();
        Doc docClone = null;
        try {
            docClone = document1.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
    }


        Long difference3 = getDifference(firstdate2,lastdate2);
    }




            private static Long getDifference(Date firstdate, Date lastdate)
            {
                long has =1000;

              Long difference = (lastdate.getTime() / has) - (firstdate.getTime() / has);

                return difference;
            }




}

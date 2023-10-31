public class MiniProject1 {
    public static void main(String[] args) {
        int da=0;
        String desg="abc";
        String[][] emp={{"1001","Ashish","01/04/2009","e","R&D","20000","8000","3000"},
                {"1002","Sushma","23/08/2012","c","PM","3000","12000","9000"},
                {"1003","Rahul","12/11/2018","k","Acct","10000","8000","1000"},
                {"1004","Chahat","29/09/2013","r","Front Desk","12000","6000","2000"},
                {"1005","Ranjan","16/07/2005","m","Engg","2300","9000","4400"},
                {"1006","Suman","1/1/2000","e","Manufacturing","23000","9000","4400"},
                {"1007","Ranjan","12/06/2006","c","PM","29000","12000","1000"}
                
                


        };
        int flag=0;
        String eno=" ",ename=" ",edept=" ",ecode =" ",ebasic=" ",ehra=" ",eit=" ";
        for(int i=0;i<emp.length;i++){
            if (emp[i][0].equals(args[0])){
                flag=1;
                eno=emp[i][0];
                ename=emp[i][2];
                edept=emp[i][4];
                ecode=emp[i][3];
                ebasic=emp[i][5];
                ehra=emp[i][6];
                eit=emp[i][7];
                break;
            }
            
        }
        char ec=ecode.charAt(0);
        switch (ec)
        {
            case 'e':
                desg="engineer";
                da=20000;
                break;
            case 'c':
                desg="consultant";
                da=32000;
                break;
            case 'k':
                desg="Clerk";
                da=12000;
                break;
            case 'r':
                desg="Receiptionist";
                da=15000;
                break;
            case 'm':
                desg="Manager";
                break;    
        }
       
        if(flag==1){
            int esal=Integer.parseInt(ebasic)+Integer.parseInt(ehra)+da-Integer.parseInt(eit);
            System.out.printf("%-15s %-15s %-15s %-15s %-15s","Emp No","EMP Name","Department","Designation","Salary");
            System.out.printf("%-15s %-15s %-15s %-15s %-15s",eno,ename,edept,desg,esal);
        }
        else{
          System.out.println("There is no employee with empid "+args[0]);
    }
}
}

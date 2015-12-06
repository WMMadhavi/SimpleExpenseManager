package lk.ac.mrt.cse.dbs.simpleexpensemanager.data.SQLiteImpl;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by Madhavi Ruwandika on 12/5/2015.
 */
public class ConstantVariable {

    public static final String DB_Name = "130636h.db";

    public static  final SimpleDateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy", Locale.getDefault());


    public static final String T_COL_2 = "Date";
    public static final String T_COL_3 = "Acc_no";
    public static final String T_COL_4 = "ExpenceType";
    public static final String T_COL_5 = "Amount";

    public static final String AC_COL_1 = "Acc_no";
    public static final String AC_COL_2 = "Branch_name";
    public static final String AC_COL_3 = "Account_halder_name";
    public static final String AC_COL_4 = "Balance";

    public static final String T_Type_Expense = "E";
    public static final String T_Type_Income = "I";

}

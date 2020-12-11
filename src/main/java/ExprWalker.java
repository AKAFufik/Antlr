import com.antr.ExprBaseListener;
import com.antr.ExprParser;

public class ExprWalker  extends ExprBaseListener {

        public void exitR(ExprParser ctx ) {
            System.out.println( "Exiting R" );
        }
}
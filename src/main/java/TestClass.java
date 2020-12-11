
import com.antr.ExprLexer;
import com.antr.ExprParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class TestClass {
    public static void main(String[] args) {
        String text = "5 / 10 + 3 * 2 - 1 + 10 / 2 + 4 * 7";
        ExprLexer lexer = new ExprLexer(CharStreams.fromString(text));
        ExprParser parser = new ExprParser(new CommonTokenStream(lexer));
        System.out.println(lexer.getAllTokens().toString());

    }
}

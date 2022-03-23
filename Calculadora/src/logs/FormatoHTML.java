package logs;

import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class FormatoHTML extends Formatter {

	@Override
	public String format(LogRecord record) {
		// TODO Auto-generated method stub
		return "<P>\n" + record.getMessage()+"</P>\n";
	}
	
	public String getHead(Handler h) {
        return "<HTML> \n <BODY> \n";
    }

	public String getTail(Handler h) {
		return "</BODY> \n </HTML> \\n ";
    }

}

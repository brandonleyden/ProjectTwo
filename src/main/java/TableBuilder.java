import java.util.LinkedList;
import java.util.List;
 
import org.apache.commons.lang3.StringUtils;
 
public class TableBuilder
{
    List<String[]> rows = new LinkedList<String[]>();


    //Takes in a string array and add it to the rows list
    public void addRow(String[] cols)
    {
        rows.add(cols);
    }

    private int[] colWidths()
    {
        int columns = -1;
 
        for(String[] row : rows)
            columns = Math.max(columns, row.length);
 
        int[] widths = new int[columns];
 
        for(String[] row : rows) {
            for(int columnsNum = 0; columnsNum < row.length; columnsNum++) {
                widths[columnsNum] =
                    Math.max(
                        widths[columnsNum],
                        StringUtils.length(row[columnsNum]));
            }
        }
 
        return widths;
    }


    //Builds the table
    @Override
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();
 
        int[] colWidths = colWidths();
 
        for(String[] row : rows) {
            for(int columnsNum = 0; columnsNum < row.length; columnsNum++) {
                stringBuilder.append(
                    StringUtils.rightPad(
                        StringUtils.defaultString(
                            row[columnsNum]), colWidths[columnsNum]));
                stringBuilder.append(' ');
            }

            stringBuilder.append('\n');
        }
 
        return stringBuilder.toString();
    }
 
}

import java.io.File; 
import java.io.IOException; 
import jxl.Cell; 
import jxl.CellType; 
import jxl.Sheet; 
import jxl.Workbook; 
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.Number;

import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Excel_Writer { 
	
	public void eintragen(int x, int y, String s) throws RowsExceededException, WriteException{
			Label lab = new Label(x,y,s);
			sheet.addCell(lab);
	}

	static WritableWorkbook workbook;
	static WritableSheet sheet;
	
	public static void init() throws IOException, RowsExceededException, WriteException {
		
		workbook = Workbook.createWorkbook(new File("output.xls")); 
		sheet = workbook.createSheet("First Sheet", 0); 
		
	    Label Fische = new Label(0, 0, "Fische:");
	    Label Haie = new Label(1, 0, "Haie:");
	    Label Wale = new Label(2, 0, "Wale:");	 
	    
		sheet.addCell(Fische);
		sheet.addCell(Haie);
		sheet.addCell(Wale);
	
		//sheet.addCell(number); 
 
		} 
	public static void fini() throws IOException, WriteException{
		workbook.write();
		workbook.close();
	}
	}
	
	

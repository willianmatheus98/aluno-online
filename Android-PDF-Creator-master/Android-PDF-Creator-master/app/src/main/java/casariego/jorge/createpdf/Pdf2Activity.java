package casariego.jorge.createpdf;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Pdf2Activity extends AppCompatActivity {

    // Storage Permissions
    private static final int REQUEST_EXTERNAL_STORAGE = 1;

    private static String[] PERMISSIONS_STORAGE = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf2);

        verifyStoragePermissions(this);
    }

    /**
     * Checks if the app has permission to write to device storage
     *
     * If the app does not has permission then the user will be prompted to grant permissions
     *
     * @param activity
     */
    public static void verifyStoragePermissions(Activity activity) {
        // Check if we have write permission
        if (ContextCompat.checkSelfPermission(activity,
                Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {

            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE)) {

                // Show an expanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.

            } else {
                // No explanation needed, we can request the permission.
                ActivityCompat.requestPermissions(activity,
                        PERMISSIONS_STORAGE,
                        REQUEST_EXTERNAL_STORAGE);

            }


        } else {
            createPDF();
        }
    }


    public static void createPDF(){
        //create document object
        Document document=new Document();

        //output file path
        String outpath= Environment.getExternalStorageDirectory()+"/PDF2.pdf";

        try {
            PdfWriter.getInstance(document, new FileOutputStream(outpath));
            document.open();
            // Left
            Paragraph paragraph = new Paragraph("This is right aligned text");
            paragraph.setAlignment(Element.ALIGN_RIGHT);
            document.add(paragraph);
            // Centered
            paragraph = new Paragraph("This is centered text");
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
            // Left
            paragraph = new Paragraph("This is left aligned text");
            paragraph.setAlignment(Element.ALIGN_LEFT);
            document.add(paragraph);
            // Left with indentation
            paragraph = new Paragraph("This is left aligned text with indentation");
            paragraph.setAlignment(Element.ALIGN_LEFT);
            paragraph.setIndentationLeft(50);
            document.add(paragraph);

            document.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (DocumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

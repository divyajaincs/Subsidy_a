import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.Toast;

import com.somya.acer.subsidy.R;
import com.somya.acer.subsidy.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.text.TextUtils;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.lang.String.*;
import java.sql.*;
import android.util.Log;
import com.google.firebase.database.DatabaseReference;
import android.app.ProgressDialog;



/**
 * Created by Acer on 17-08-2017.
 */

public class urlconnect extends ActionBarActivity {
    public static void main(String[] args) {


        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
                "databaseName=subsidy;integratedSecurity=true;";

        // Declare the JDBC objects.
        Connection con = null;
        //EditText Password =(EditText)findViewById(R.id.Password);
        Statement stmt = null;
        Statement stmt1=null;
        ResultSet rs = null;
        /*EditText Gas_id =(EditText)findViewById(R.id.Gas_Id);
        EditText Bhamashah =(EditText)findViewById(R.id.Bhamashah_ID);
        EditText contact =(EditText)findViewById(R.id.Contact);
        Editable Password1 =Password.getText();
        Editable Gas_id1 =Gas_id.getText();
        String Bhamashah_ID =bham.getText().toString();
        String Contact =contact1.getText().toString();
        ga=Gas_id.getText();
        ba=Bhamashah_ID.getText();`
        ca=Contact.getText();*/


        try {
            // Establish the connection.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionUrl);

            // Create and execute an SQL statement that returns some data.
            String SQL = "select bhamashah_id where";
            stmt = con.createStatement();

            rs = stmt.executeQuery(SQL);

            // Iterate through the data in the result set and display it.
            while (rs.next()) {

            }
        }

        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) try {
                rs.close();
            } catch (Exception e) {
            }
            if (stmt != null) try {
                stmt.close();
            } catch (Exception e) {
            }
            if (con != null) try {
                con.close();
            } catch (Exception e) {
            }
        }

    }

    public class register extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_register);

        }

        public void next(View view) {
            Toast.makeText(this, "YOU HAVE SUCCESSFULLY REGISTERD..!!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, login.class);
            startActivity(intent);
        }
    }
}
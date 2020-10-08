package pl.com.tt.javafxdemo;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import pl.com.tt.arithmetic.parser.Parser;

public class FXMLController implements Initializable {
	
    @FXML
    private TextArea polex;
    @FXML
    private TextArea pole;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button button0;
    @FXML
    private Button button_sin;
    @FXML
    private Button button_cos;
    @FXML
    private Button button_tg;
    @FXML
    private Button button_ctg;
    @FXML
    private Button button_abs;
    @FXML
    private Button button_sqrt;
    @FXML
    private Button button_rownasie;
    @FXML
    private Button button_otworznawias;
    @FXML
    private Button button_zamknijnawias;
    @FXML
    private Button button_plus;
    @FXML
    private Button button_minus;
    @FXML
    private Button button_razy;
    @FXML
    private Button button_podzielic;
    @FXML
    private Button button_potega;
    @FXML
    private Button button_pomnozyc;
    
    
    
   
    
    @FXML
    private void buttonaction1(ActionEvent event) {
    	pole.setText(pole.getText()+"1");
    }
    @FXML
    private void buttonaction2(ActionEvent event) {
    	pole.setText(pole.getText()+"2");
    }
    @FXML
    private void buttonaction3(ActionEvent event) {
    	pole.setText(pole.getText()+"3");
    }
    @FXML
    private void buttonaction4(ActionEvent event) {
    	pole.setText(pole.getText()+"4");
    }
    @FXML
    private void buttonaction5(ActionEvent event) {
    	pole.setText(pole.getText()+"5");
    }
    @FXML
    private void buttonaction6(ActionEvent event) {
    	pole.setText(pole.getText()+"6");
    }
    @FXML
    private void buttonaction7(ActionEvent event) {
    	pole.setText(pole.getText()+"7");
    }
    @FXML
    private void buttonaction8(ActionEvent event) {
    	pole.setText(pole.getText()+"8");
    }
    @FXML
    private void buttonaction9(ActionEvent event) {
    	pole.setText(pole.getText()+"9");
    }
    @FXML
    private void buttonaction0(ActionEvent event) {
    	pole.setText(pole.getText()+"0");
    }
    @FXML
    private void buttonaction_sin(ActionEvent event) {
    	pole.setText(pole.getText()+"sin(");
    }
    @FXML
    private void buttonaction_cos(ActionEvent event) {
    	pole.setText(pole.getText()+"cos(");
    }
    @FXML
    private void buttonaction_tg(ActionEvent event) {
    	pole.setText(pole.getText()+"tg(");
    }
    @FXML
    private void buttonaction_ctg(ActionEvent event) {
    	pole.setText(pole.getText()+"ctg(");
    }
    @FXML
    private void buttonaction_abs(ActionEvent event) {
    	pole.setText(pole.getText()+"abs(");
    }
    @FXML
    private void buttonaction_sqrt(ActionEvent event) {
    	pole.setText(pole.getText()+"sqrt(");
    }
    @FXML
    private void buttonaction_otworznawias(ActionEvent event) {
    	pole.setText(pole.getText()+"(");
    }
    @FXML
    private void buttonaction_zamknijnawias(ActionEvent event) {
    	pole.setText(pole.getText()+")");
    }
    @FXML
    private void buttonaction_plus(ActionEvent event) {
    	pole.setText(pole.getText()+"+");
    }
    @FXML
    private void buttonaction_minus(ActionEvent event) {
    	pole.setText(pole.getText()+"-");
    }
    @FXML
    private void buttonaction_pomnozyc(ActionEvent event) {
    	pole.setText(pole.getText()+"*");
    }
    @FXML
    private void buttonaction_podzielic(ActionEvent event) {
    	pole.setText(pole.getText()+"/");
    }
    @FXML
    private void buttonaction_potega(ActionEvent event) {
    	pole.setText(pole.getText()+"^");
    }
    @FXML
    private void buttonaction_rownasie(ActionEvent event) {
    	Parser p1 = new Parser();
    	String string = p1.parse(pole.getText().replace("x", polex.getText())).calculate().toString();
    	pole.setText(pole.getText().replace("x", polex.getText())+"="+string);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}

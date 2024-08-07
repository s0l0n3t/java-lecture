package core;

import javax.swing.*;

public class helper {

    //Theme has been added.
    public static void setTheme(){
        for(UIManager.LookAndFeelInfo info: UIManager.getInstalledLookAndFeels()){
            if (info.getName().equals("Nimbus")) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());

                }
                catch (Exception e){
                    e.printStackTrace();
                }

            }
        }
    }
    public static boolean isEmpty(JTextField field){
        return field.getText().trim().isEmpty();
    }
    public static boolean isEmptyArrayEmpty(JTextField[] field){
        for(int x = 0;x< field.length;x++){
           if(isEmpty(field[x])) return true;
        }
        return false;
    }
    public static boolean isEmailValid(String inputEmail) {

        if (!inputEmail.contains("@")) return false;

        String[] inputEmailParse = inputEmail.split("@");
        try {
            if (!inputEmailParse[1].contains(".")) return false;
        }
        catch (ArrayIndexOutOfBoundsException e){
            return false;
        }

        String[] inputEmailParseDot = inputEmailParse[1].toString().split("\\.");
        if (inputEmailParse[0].trim().isEmpty() || inputEmailParse[1].trim().isEmpty()) return false;
        if (inputEmailParseDot[0].trim().isEmpty()) return false;
        try {
            if (inputEmailParseDot[1].trim().isEmpty()) return false;
            if (!inputEmailParseDot[1].trim().toString().equals("com")) return false;
        }
        catch (ArrayIndexOutOfBoundsException e){//If parse array is null.
            return false;
        }
        return true;
    }


//WARNING Error Dialog
    public static int warningSure(){
        return JOptionPane.showConfirmDialog(null, "Çıkmak istediğinize emin misiniz ?", "Warning", JOptionPane.YES_NO_OPTION);
    }
//WARNING Empty Textbox
    public static void emptyTextBox(){
        JOptionPane.showMessageDialog(null,"Lütfen boş bırakmayınız !","Hata",JOptionPane.WARNING_MESSAGE);
    }
//WARNING Db Connection Error
    public static void dbError(Exception exception){
        JOptionPane.showMessageDialog(null,exception.getMessage(),"Hata",JOptionPane.WARNING_MESSAGE);
    }
//INFORMATION Error Dialog
    public static void loginSuccessful(CREATETYPE createtype){
        if(createtype.equals(CREATETYPE.CUSTOMER)){
            JOptionPane.showMessageDialog(null, "Müşteri"+" eklendi","Başarılı !",JOptionPane.INFORMATION_MESSAGE);
        }
        if(createtype.equals(CREATETYPE.PRODUCT)){
            JOptionPane.showMessageDialog(null, "Ürün"+" eklendi","Başarılı !",JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            System.out.println("Unknown creating type");
        }
    }
//ENUM for Creating Type
    public static enum CREATETYPE{
        CUSTOMER,
        PRODUCT
    }
}

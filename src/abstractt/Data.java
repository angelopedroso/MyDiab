/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractt;

/**
 *
 * @author angel
 */
abstract public class Data {
    private static String rdCode;
    private static String email;

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String aemail) {
        email = aemail;
    }
    
    public static String getRdCode() {
        return rdCode;
    }

    public static void setRdCode(String aRdCode) {
        rdCode = aRdCode;
    }
}

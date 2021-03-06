package siscalci;

/* 
* Esta classe limita o número de caracteres inseridos em um JTextField 
* Para usar este Document: ((AbstractDocument)jTextField.getDocuement()).setDocumentFilter(new FixedLengthDocument(5)); 
*/  

import javax.swing.text.AttributeSet;  
import javax.swing.text.BadLocationException;  
import javax.swing.text.DocumentFilter;  
  
public class FixedLenghtDocument extends DocumentFilter {  
    private int iMaxLength;  
     
    public FixedLenghtDocument(int maxLen) {  
        super();  
        iMaxLength = maxLen;  
    }  
      
    @Override  
    public void insertString(FilterBypass fb, int offset, String str, AttributeSet attr) throws BadLocationException {  
        // Método não utilizado, mas sua implementação é obrigatória  
    }  
  
    @Override  
    public void replace(FilterBypass fb, int offset, int length, String str, AttributeSet attr) throws BadLocationException {  
        if (str == null) return;  
          
        // Aceita qualquer número de caracteres  
        if (iMaxLength <= 0) {                     
            if(length == 0)  
                // Se não houver seleção no campo, insere a string  
                fb.insertString(offset, str, attr);  
            else  
                // Caso tenha seleção, substitui o trecho selecionado pela string  
                fb.replace(offset, length, str, attr);  
              
            return;    
        }  
          
        int ilen = (fb.getDocument().getLength() + str.length());  
          
        // Se o comprimento final for menor, aceita str  
        if (ilen <= iMaxLength) {  
            if(length == 0)  
                // Se não houver seleção no campo, insere a string  
                fb.insertString(offset, str, attr);  
            else  
                // Caso tenha seleção, substitui o trecho selecionado pela string  
                fb.replace(offset, length, str, attr);  
        } else {  
            // Se o comprimento for igual ao máximo, não faz nada  
            if (fb.getDocument().getLength() == iMaxLength)  
                return;  
              
            // Se ainda resta espaço na String, pega os caracteres aceitos  
            String newStr = str.substring(0, (iMaxLength - fb.getDocument().getLength()));    
              
            if(length == 0)  
                // Se não houver seleção no campo, insere a string  
                fb.insertString(offset, newStr, attr);  
            else  
                // Caso tenha seleção, substitui o trecho selecionado pela string  
                fb.replace(offset, length, newStr, attr);  
        }  
    }  
}  

/*
    Criado por:
    http://www.guj.com.br/java/107425-como-fazer-para-o-campo-textfield-receber-so-numeros#1491647
*/
import javax.swing.JOptionPane;
public class atvd3{
public static void main(String []args) {
	
int numeral[]=new int[10];
int procurador;

	JOptionPane.showMessageDialog(null, "Escolha 5 números no teste \n de arrays");
	
	for (int i=0;  i<5; i++) {
		
		
		numeral[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite os seus números:"));
		
	}
	procurador=Integer.parseInt(JOptionPane.showInputDialog( "Agora, pesquise um número para\n descobrir se ele está no array"));

	if(procurador==numeral[0]) {
		JOptionPane.showMessageDialog(null,"Ele existe simm!\n Aqui estáo que você pesquisou:" +procurador +"\n  O que está guardado:"+ numeral[0]);
	}
	else if(procurador==numeral[1]) {
		JOptionPane.showMessageDialog(null,"Ele existe simm!\n Aqui está o que você pesquisou:" +procurador +"\n  O que está guardado:"+ numeral[1]);
	}
	else if(procurador==numeral[2]) {
		JOptionPane.showMessageDialog(null,"Ele existe simm!\n Aqui está o que você pesquisou:" +procurador +"\n  O que está guardado:"+ numeral[2]);
	}
	else if(procurador==numeral[3]) {
		JOptionPane.showMessageDialog(null,"Ele existe simm!\n Aqui está o que você pesquisou: " +procurador +"\n O que está guardado: "+ numeral[3]);
	}
	else if(procurador==numeral[4]) {
		JOptionPane.showMessageDialog(null,"Ele existe simm!\n Aqui está o que você pesquisou:" +procurador +"\n  O que está guardado:" + numeral[4]);
	}
	else {
		JOptionPane.showMessageDialog(null, "Este número não existe...\n tente outro mais tarde");
	}
	
}
}

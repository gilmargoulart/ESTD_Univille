package simulador;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.LineBorder;

public class Simulator extends JFrame {

    private static final long serialVersionUID = -3277561239646731164L;
    
    //Fila
    private Queue<String> queue;
    
    private Stack<String> stack;
    
    private JPanel panelFila;
    private JLabel lblFila;
    private JTextField txtEnqueue;
    private JTextField txtDequeue;
    private JTextField txtFront;
    private JButton btnFront;
    private JButton btnEnqueue;
    private JLabel lblContedoDaFila;
    private JPanel pnlArrayFila;
    private JButton item1;
    private JButton item2;
    private JButton item3;
    private JButton item4;
    private JButton item5;
    private JButton item6;
    private JPanel panelPilha;
    private JLabel lblArraySize;
    private JLabel lblArrayLength;
    private JLabel lblPilha;
    private JTextField txtPush;
    private JTextField txtPop;
    private JTextField txtTop;
    private JButton btnPush;
    private JButton btnPop;
    private JButton btnTop;
    private JLabel lblConteudoDaPilha;
    private JPanel panelArraypilha;
    private JButton btnStack1;
    private JButton btnStack2;
    private JButton btnStack3;
    private JButton btnStack4;
    private JButton btnStack5;
    private JButton btnStack6;
    private JLabel lblPilhaArraySize;
    private JLabel lblPilhaArrayCapacity;

    public static void main(final String[] args) {
        try {
            for (final LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                }
            }
        } catch (final Exception e) {
        }

        Simulator frame = new Simulator();
        frame.setVisible(true);
    }

    public Simulator() {
        setTitle("Simulador de Filas e Pilhas");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 560, 400);
        getContentPane().setLayout(new GridLayout(2, 1, 5, 5));

        panelFila = new JPanel();
        panelFila.setBorder(new LineBorder(new Color(0, 0, 0)));
        getContentPane().add(panelFila);
        panelFila.setLayout(null);

        lblFila = new JLabel("Fila");
        lblFila.setBounds(10, 11, 46, 14);
        panelFila.add(lblFila);

        txtEnqueue = new JTextField();
        txtEnqueue.setBounds(10, 35, 80, 20);
        panelFila.add(txtEnqueue);
        txtEnqueue.setColumns(10);

        txtDequeue = new JTextField();
        txtDequeue.setColumns(10);
        txtDequeue.setBounds(199, 35, 80, 20);
        panelFila.add(txtDequeue);

        txtFront = new JTextField();
        txtFront.setColumns(10);
        txtFront.setBounds(378, 35, 80, 20);
        panelFila.add(txtFront);

        btnEnqueue = new JButton("enqueue");
        btnEnqueue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
            	btnEnqueue();
            }
        });
        
        btnEnqueue.setBounds(100, 35, 80, 20);
        panelFila.add(btnEnqueue);

        final JButton btnDequeue = new JButton("dequeue");
        btnDequeue.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		btnDequeue();
        	}
        });
        btnDequeue.setBounds(280, 35, 80, 20);
        panelFila.add(btnDequeue);

        btnFront = new JButton("front");
        this.btnFront.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		btnFront();
        	}
        });
        btnFront.setBounds(460, 35, 80, 20);
        panelFila.add(btnFront);

        lblContedoDaFila = new JLabel("Conte\u00FAdo da Fila");
        lblContedoDaFila.setBounds(35, 70, 170, 14);
        panelFila.add(lblContedoDaFila);

        pnlArrayFila = new JPanel();
        pnlArrayFila.setBorder(new LineBorder(new Color(0, 0, 0)));
        pnlArrayFila.setBounds(35, 84, 490, 80);
        panelFila.add(pnlArrayFila);
        pnlArrayFila.setLayout(null);

        item1 = new JButton();
        item1.setBounds(10, 11, 70, 60);
        pnlArrayFila.add(item1);

        item2 = new JButton();
        item2.setBounds(90, 11, 70, 60);
        pnlArrayFila.add(item2);

        item3 = new JButton();
        item3.setBounds(170, 11, 70, 60);
        pnlArrayFila.add(item3);

        item4 = new JButton();
        item4.setBounds(250, 11, 70, 60);
        pnlArrayFila.add(item4);

        item5 = new JButton();
        item5.setBounds(336, 12, 70, 60);
        pnlArrayFila.add(item5);

        item6 = new JButton();
        item6.setBounds(410, 11, 70, 60);
        pnlArrayFila.add(item6);
        
        this.lblArraySize = new JLabel("Array Size(): 0");
        this.lblArraySize.setBounds(34, 166, 80, 14);
        this.panelFila.add(this.lblArraySize);
        
        this.lblArrayLength = new JLabel("Array Capacity(): 0");
        this.lblArrayLength.setBounds(147, 166, 105, 14);
        this.panelFila.add(this.lblArrayLength);

        panelPilha = new JPanel();
        panelPilha.setBorder(new LineBorder(new Color(0, 0, 0)));
        getContentPane().add(panelPilha);
        this.panelPilha.setLayout(null);
        
        this.lblPilha = new JLabel("Pilha");
        this.lblPilha.setBounds(10, 11, 46, 14);
        this.panelPilha.add(this.lblPilha);
        
        this.txtPush = new JTextField();
        this.txtPush.setText("93");
        this.txtPush.setColumns(10);
        this.txtPush.setBounds(10, 27, 80, 20);
        this.panelPilha.add(this.txtPush);
        
        this.txtPop = new JTextField();
        this.txtPop.setColumns(10);
        this.txtPop.setBounds(183, 27, 80, 20);
        this.panelPilha.add(this.txtPop);
        
        this.txtTop = new JTextField();
        this.txtTop.setColumns(10);
        this.txtTop.setBounds(371, 27, 80, 20);
        this.panelPilha.add(this.txtTop);
        
        this.btnPush = new JButton("Push");
        this.btnPush.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		btnPush();
        	}
        });
        this.btnPush.setBounds(93, 27, 80, 20);
        this.panelPilha.add(this.btnPush);
        
        this.btnPop = new JButton("Pop");
        this.btnPop.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		btnPop();
        	}
        });
        this.btnPop.setBounds(266, 27, 80, 20);
        this.panelPilha.add(this.btnPop);
        
        this.btnTop = new JButton("Top");
        this.btnTop.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		btnTop();
        	}
        });
        this.btnTop.setBounds(453, 27, 80, 20);
        this.panelPilha.add(this.btnTop);
        
        this.lblConteudoDaPilha = new JLabel("Conte\u00FAdo da Pilha");
        this.lblConteudoDaPilha.setBounds(34, 64, 170, 14);
        this.panelPilha.add(this.lblConteudoDaPilha);
        
        this.panelArraypilha = new JPanel();
        this.panelArraypilha.setLayout(null);
        this.panelArraypilha.setBorder(new LineBorder(new Color(0, 0, 0)));
        this.panelArraypilha.setBounds(34, 79, 490, 80);
        this.panelPilha.add(this.panelArraypilha);
        
        this.btnStack1 = new JButton();
        this.btnStack1.setBounds(10, 11, 70, 60);
        this.panelArraypilha.add(this.btnStack1);
        
        this.btnStack2 = new JButton();
        this.btnStack2.setBounds(90, 11, 70, 60);
        this.panelArraypilha.add(this.btnStack2);
        
        this.btnStack3 = new JButton();
        this.btnStack3.setBounds(170, 11, 70, 60);
        this.panelArraypilha.add(this.btnStack3);
        
        this.btnStack4 = new JButton();
        this.btnStack4.setBounds(250, 11, 70, 60);
        this.panelArraypilha.add(this.btnStack4);
        
        this.btnStack5 = new JButton();
        this.btnStack5.setBounds(330, 11, 70, 60);
        this.panelArraypilha.add(this.btnStack5);
        
        this.btnStack6 = new JButton();
        this.btnStack6.setBounds(410, 11, 70, 60);
        this.panelArraypilha.add(this.btnStack6);
        
        this.lblPilhaArraySize = new JLabel("Array Size(): 0");
        this.lblPilhaArraySize.setBounds(35, 161, 80, 14);
        this.panelPilha.add(this.lblPilhaArraySize);
        
        this.lblPilhaArrayCapacity = new JLabel("Array Capacity(): 0");
        this.lblPilhaArrayCapacity.setBounds(132, 161, 105, 14);
        this.panelPilha.add(this.lblPilhaArrayCapacity);
        
        //Inicializar fila.
        queue = new Queue<String>(6);
        
        //Inicializar pilha
        stack = new Stack<String>(6);
        
        setRandomText();
    }

	private void btnEnqueue(){
    	queue.enqueue(txtEnqueue.getText());
    	refreshButtons();
    	setRandomText();
    }
    
    private void btnDequeue(){
    	Object dequeued = queue.dequeue();
    	if (dequeued == null){
    		dequeued = "";
    	}
    	txtDequeue.setText(dequeued.toString());
    	refreshButtons();
    }
    
    private void btnFront() {
    	Object front = queue.front();
    	if(front != null){
    		txtFront.setText(front.toString());
    	}
	}
    
    private void refreshButtons(){
    	
    	lblArrayLength.setText("Array Capacity: " + String.valueOf(queue.getCapacity()));
    	lblArraySize.setText("Array Size: " + String.valueOf(queue.size()));
    	
    	item1.setText("");
    	item2.setText("");
    	item3.setText("");
    	item4.setText("");
    	item5.setText("");
    	item6.setText("");
    	
    	//Verificar s há itens no Array
    	if (queue.isEmpty()){
    		return;
    	}
    	
    	Object[] stringArray = queue.getArray();
    	
    	int i = 0;
    	boolean exit = false;
    	for (Object s : stringArray) {
			if (s == null){
				s = "";
			}
    		switch (i) {
				case 0:
					item1.setText(s.toString());
					break;
				
				case 1:
					item2.setText(s.toString());
					break;
					
				case 2:
					item3.setText(s.toString());
					break;
					
				case 3:
					item4.setText(s.toString());
					break;
					
				case 4:
					item5.setText(s.toString());
					break;
					
				case 5:
					item6.setText(s.toString());
					break;
					
				default:
					exit = true;
					break;
			}
			
			if (exit){
				break;
			}
			
			//Incrementar contador
			i++;
		}
    	
    }
    
    private void setRandomText(){
    	int random = new Random().nextInt(500);
    	txtEnqueue.setText(String.valueOf(random));
    	txtPush.setText(String.valueOf(random));
    }
    
    
    private void btnPush() {
    	stack.push(txtPush.getText());
    	refreshStackButtons();
    	setRandomText();
	}
    
    private void btnPop() {
		Object pop = stack.pop();
    	if(pop == null){
    		pop = "";
    	}
		txtPop.setText(pop.toString());
    	refreshStackButtons();
	}
    
    private void btnTop() {
		Object top = stack.top();
		if(top == null){
			top = "";
		}
    	txtTop.setText(top.toString());
	}
    
    private void refreshStackButtons() {
    	lblPilhaArrayCapacity.setText("Array Capacity: " + String.valueOf(stack.getCapacity()));
    	lblPilhaArraySize.setText("Array Size: " + String.valueOf(stack.getSize()));
    	
    	btnStack1.setText("");
    	btnStack2.setText("");
    	btnStack3.setText("");
    	btnStack4.setText("");
    	btnStack5.setText("");
    	btnStack6.setText("");
    	
    	//Verificar s há itens na pilha
    	if (stack.isEmpty()){
    		return;
    	}
    	
    	Object[] stringArray = stack.getArray();
    	
    	int i = 0;
    	boolean exit = false;
    	for (Object s : stringArray) {
			if (s == null){
				s = "";
			}
    		switch (i) {
				case 0:
					btnStack1.setText(s.toString());
					break;
				
				case 1:
					btnStack2.setText(s.toString());
					break;
					
				case 2:
					btnStack3.setText(s.toString());
					break;
					
				case 3:
					btnStack4.setText(s.toString());
					break;
					
				case 4:
					btnStack5.setText(s.toString());
					break;
					
				case 5:
					btnStack6.setText(s.toString());
					break;
					
				default:
					exit = true;
					break;
			}
			
			if (exit){
				break;
			}
			
			//Incrementar contador
			i++;
		}
    }
}

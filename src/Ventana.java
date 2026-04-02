import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel panel;
    private JTextField txtTitulo;
    private JTextArea txtMensaje;
    private JButton btnAgregar;
    private JButton btnEliminar;
    private JButton btnCima;
    private JButton btnListar;
    private JTextArea txtListar;
    private JButton btnLikes;
    Pila pila1=new Pila();

    public Ventana() {
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String titulo=txtTitulo.getText();
                String mensaje=txtMensaje.getText();
                Publicacion obj=new Publicacion(titulo,mensaje);
                pila1.push(obj);
                JOptionPane.showMessageDialog(null
                        ,"Se agregó correctamente ");

            }
        });
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Publicacion eliminado = pila1.pop();
                    txtListar.setText("Se eliminó "+eliminado);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,
                         ex.getMessage());
                }

            }
        });
        btnCima.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                Publicacion dato=pila1.peek();
                txtListar.setText("El elemento en la cima actual es: "+dato);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,
                            ex.getMessage());
                }
            }
        });
        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtListar.setText(pila1.listarTodos());
            }
        });
        btnLikes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             try {
                 pila1.peek().aumentarLikes();
                 txtListar.setText(pila1.listarTodos());
             } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                        ex.getMessage());
             }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

package UMG.UI;

public class AppTransporteUMG {
    public static void main(String[] args) {
        // Esto hace que al iniciar el programa se abra el formulario de Camiones
        java.awt.EventQueue.invokeLater(() -> {
            new FrmCamion().setVisible(true);
        });
    }
}
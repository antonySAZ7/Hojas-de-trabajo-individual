
// esta clase repreesenta un paciente en la cola de espera
public class Paciente implements Comparable<Paciente>{

        private String nombre;
        private String sintoma;
        private String codigoPrioridad;

        public Paciente(String nombre, String sintoma, String codigoPrioridad) {
            this.nombre = nombre;
            this.sintoma = sintoma;
            this.codigoPrioridad = codigoPrioridad;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public String getCodigoPrioridad() {
        return codigoPrioridad;
    }

    public void setCodigoPrioridad(String codigoPrioridad) {
        this.codigoPrioridad = codigoPrioridad;
    }

    @Override
    public int compareTo(Paciente otroPaciente) {
        return this.codigoPrioridad.compareTo(otroPaciente.codigoPrioridad);
    }

    @Override
    public String toString(){
        return  nombre  + ", " + sintoma + ", " + codigoPrioridad;
    }






}
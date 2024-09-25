    public class filme {
        String titulo;
        int min;
        String genero;

        public filme(){
        }

        public filme(String titulo, int min, String genero){
            this.titulo = titulo;
            this.min = min;
            this.genero = genero;
            
            if(titulo==null){
                throw new IllegalArgumentException("O título não pode estar vazio");
            }
            if(min<=0){
                throw new IllegalArgumentException("A minutagem não pode ser igual a 0");
            }
            if (!genero.equals("Romance") && !genero.equals("Terror") && !genero.equals("Comédia")) {
                throw new IllegalArgumentException("O filme deve ser de um dos três gêneros: Romance, Terror ou Comédia");
            }
        } 
    }
public  class Main{
    public static void main(String[] args) {
            // Exemplo de filme válido
            filme f1 = new filme("A Bela e a Fera", 120, "Romance");
            System.out.println(f1);
    }
}
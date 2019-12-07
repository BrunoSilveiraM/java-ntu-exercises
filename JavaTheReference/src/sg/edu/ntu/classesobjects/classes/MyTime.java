package sg.edu.ntu.classesobjects.classes;

/***
 * Classe baseada na lista de exercícios :
 * https://www.ntu.edu.sg/home/ehchua/programming/java/J3f_OOPExercises.html#zz-3.4
 */
public class MyTime {
    /***
     * Declaração de variáveis.
     */
    private int hour;
    private int minute;
    private int second;

    /***
     * Construtor default
     */
    public MyTime(){
        // inicializa as variáveis com valores padrões.
        hour = 0;
        minute = 0;
        second = 0;
    }
    /***
     * Construtor que inicializa hora, minuto e segundo.
     * @param hour
     * @param minute
     * @param second
     */
    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    /*
     Declaração de Getters.
     */
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
   /*
     Declaração de Setters.
    */
    public void setHour(int hour){
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /***
     * Imprime a hora com 0 na frente quando necessário.
     * @return
     */
    public String toString() {
        return String.format("%02d:%02d:%02d",hour, minute,second);
    }
    /***
     * Adianta o tempo em um segundo.
     * Retorna um objeto do tipo Mytime com a hora atualizada.
     * @return
     */
    public MyTime nextSecond() {
        ++second; // incrementa os segundos.
        if(second >= 60){ // verifica se ao incrementar os segundos estamos em um novo minuto.
            second = 0; // novo minuto então os segundos zeram.
            ++minute; // incrementa os minutos.
            if(minute >= 60){ // verifica se ao incrementar os minutos estamos em uma nova hora.
                minute = 0; // nova hora então os minutos zeram.
                ++hour; // incrementa as horas.
                if(hour >= 24){ // verifica se chegamos na meia-noite.
                    hour = 0; // meia-noite a hora zera.
                }
            }
        }
        // retorna o objeto que chamou a função.
        return this;
    }

    /***
     * Regressa o tempo em um segundo.
     * Retorna um objeto do tipo Mytime com a hora atualizada.
     * @return
     */
    public MyTime previousSecond() {
        --second; // decrementa os segundos.
        if(second < 0){ // verifica se regressou para um valor antes do segundo 0.
            //como temos um valor negativo subtraímos de 60.
            //para termos os valores dos segundos.
            second = 60 + second;
            --minute; // decrementa o valor de minutos pois os segundos saíram do limite 60-0.
            if(minute < 0){// verifica se regressou para um valor antes do minuto 0.
                minute = 60 + minute;
                hour--;
                if(hour < 0){ // verifica se regressou para um valor antes da meia-noite.
                    hour = 24 + hour;
                }
            }
        }
        // retorna o objeto que foi chamou a função.
        return this;
    }

    /***
     * Adianta o tempo em um minuto.
     * Retorna um objeto do tipo Mytime com a hora atualizada.
     * @return
     */
    public MyTime nextMinute(){
        ++minute; // incrementa os minutos.
        if(minute >= 60){ // verifica se ao incrementar os minutos estamos em uma nova hora.
            minute = 0; // nova hora então os minutos zeram.
            ++hour; // incrementa as horas.
            if(hour >= 24){ // verifica se chegamos na meia-noite.
                hour = 0; // meia-noite a hora zera.
            }
        }
        return this;
    }

    /***
     * Adianta o tempo em uma hora.
     * Retorna um objeto do tipo Mytime com a hora atualizada.
     * @return
     */
    public MyTime nextHour(){
        ++hour; // incrementa as horas.
        if(hour >= 24){ // verifica se chegamos na meia-noite.
            hour = 0; // meia-noite a hora zera.
        }
        return this;
    }

    /***
     * Regressa o tempo em um minuto.
     * Retorna um objeto do tipo Mytime com a hora atualizada.
     * @return
     */
    public MyTime previousMinute() {
        --minute; // decrementa o valor de minutos pois os segundos saíram do limite 60-0.
        if(minute < 0){// verifica se regressou para um valor antes do minuto 0.
            minute = 60 + minute;
            hour--;
            if(hour < 0){
                hour = 24 + hour;
            }
        }
        return this;
    }

    /***
     * Regressa o tempo em uma hora.
     * Retorna um objeto do tipo Mytime com a hora atualizada.
     * @return
     */
    public MyTime previousHour() {
        --hour; // decrementa a hora.
        if (hour < 0) { // verifica se o regresso não está na meia-noite.
                    /*
                    Se o regresso for na meia-noite então se o horário for 0, temos 0 - 1 = -1.
                    24 - 1 = 23.
                    No geral o decremento é feito de forma livre.
                    Ex : 2 - 1 = 1  hora.
                     */
            hour = 24 + hour;
        }
        return this;
    }
}

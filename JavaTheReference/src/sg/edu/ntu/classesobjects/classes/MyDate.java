package sg.edu.ntu.classesobjects.classes;
/***
 * Classe baseada no exercício 3.5 da lista:
 * https://www.ntu.edu.sg/home/ehchua/programming/java/J3f_OOPExercises.html#zz-3.5
 */
public class MyDate {
    /*
    Declaração de variáveis.
     */
    private int day;
    private int month;
    private int year;

    private static final String[] strMonths =
            {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                    "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private static final String[] strDays =
            {"Sunday", "Monday", "Tuesday",
                    "Wednesday", "Thursday", "Friday",
                    "Saturday"};
    private static final int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private static final int[] numbersMonthTable = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

    private static final int[] numbersMonthTableLeap = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

    /***
     * Construtor que inicializa as variáveis day, month e year.
     * @param day int
     * @param month int
     * @param year int
     */
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        // verifica se o dia para a data é válido.
        if (isValidDate(day, this.month, this.year)) {
            this.day = day;
        }
    }

    public void setMonth(int month) {
        // verifica se o mês para a data é valido.
        if (month >= 1 && month <= 12) {
            this.month = month;
        }
    }

    public void setYear(int year) {
        //verifica se o ano para a data é valido.
        if (year >= 1 && year <= 9999) {
            this.year = year;
        }
    }

    public void setDate(int day, int month, int year) {
        // Verifica se a data do parâmetro é válida.
        if (isValidDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    /***
     * Exibe data com a formatação : 0x/0x/xxxx
     * @return void
     */
    public String toString() {
        return String.format("%02d/%02d/%d", day, month, year % 100);
    }

    /***
     * Exibe data com a formatação:
     * nomedia numerodia nomemes ano --> Tuesday 14 Feb 2012
     * @return String
     */
    public String toString2() {
        return String.format("%s %02d %s %02d", strDays[getDayOfTheWeek(year, month, day)],
                day, strMonths[month - 1],
                year);
    }

    /***
     *  Verifica se o ano é bissexto.
     * @param year int
     * @return String
     */
    public boolean isLeapYear(int year) {
        /*
        Considera que o ano divisível por 4 é bissexto porém se o ano for também divisível por 100 precisa ser
        divisível por 400 para ser bissexto.
        1º Caso:
        Ano % 4 == 0 e Ano % 100 != 0 retorna V na conjunção e para a disjunção o valor de Ano % 400 é irrelevante.
        2º Caso :
        Ano % 4 == 0 e Ano % 100 == 0 retorna F na conjução e para a disjunção ser verdadeira é preciso que Ano % 400
        seja igual a 0.
         */
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    /***
     * Verifica se a data é válida.
     * @param year int
     * @param month int
     * @param day int
     * @return boolean
     */
    public boolean isValidDate(int year, int month, int day) {
        // verifica limite do ano.
        if (year < 1 || year > 9999) {
            return false;
        }
        // verifica limite do mês.
        if (month < 1 || month > 12) {
            return false;
        }
        //verifica o limite dos dias.
        if (day < 1 || day > daysInMonths[month - 1]) {
            //dias de Fevereiro em ano bissexto possuem um dia a mais.
            if (isLeapYear(year) && month == 2) {
                // adiciona um dia ao mês de Fevereiro.
                int daysLeap = daysInMonths[month - 1] + 1;
                // verifica se o dia extrapola o limite para Fevereiro em ano bissexto e retorna o valor lógico.
                return day <= daysLeap;
            }
            return false;
        }
        return true;
    }

    /***
     * Retorna o dígito para o ano de acordo com o link :
     * https://www.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html#dateutil
     * @param year
     * @return
     */
    public int digitYear(int year){
        int firstDigits = year / 100; // armazena os primeiros 2 dígitos do ano.
        //tomando como base os dois primeiros dígitos do ano achamos o dígito a retornar.
        if(firstDigits == 17 || firstDigits == 21){
            return 4;
        }
        if(firstDigits == 18 || firstDigits == 22){
            return 2;
        }
        if(firstDigits == 19 || firstDigits == 23){
            return 0;
        }
        if(firstDigits == 20 || firstDigits == 24){
            return 6;
        }
        // retorno inserido apenas para o compilador não acusar erro.
        return 0;
    }
    /***
     * Retorna o número do dia da semana.
     * @param year int
     * @param month int
     * @param day int
     * @return int
     */
    public int getDayOfTheWeek(int year, int month, int day){
        //um dos números da fórmula têm comportamentos diferentes de acordo com ano ser bissexto ou não.
        if(isLeapYear(year)){
            return ((digitYear(year) + year % 100 + ((year % 100)/ 4) +
                    numbersMonthTableLeap[month - 1] + day) % 7);
        }
        //retorna o número de acordo com a fórmula.
        return ((digitYear(year) + year % 100 + ((year % 100)/ 4) +
                numbersMonthTable[month - 1] + day) % 7);
        }
    /***
     * Atualiza o dia.
     * @return int
     */
    public MyDate nextDay() {
        ++day;
        //verifica se o novo dia entra em um novo mês.
        if (day > daysInMonths[month - 1]) {
            //dias de Fevereiro em ano bissexto possuem um dia a mais.
            if (isLeapYear(year) && month == 2) {
                //adiciona um dia ao mês de Fevereiro.
                int daysLeap = daysInMonths[month - 1] + 1;
                //verifica se o novo dia entra em um novo mês.
                if (day > daysLeap) {
                    day = 1;// novo mês então estamos no dia primeiro.
                    ++month;// incrementa o mês para Março.
                    return this;
                }
                return this;
            }
            day = 1; // novo mês então estamos no dia primeiro.
            ++month; // próximo mês.
            if (month > 12) { // verifica se o próximo mês está em um novo ano.
                month = 1; // novo ano então estamos no dia primeiro.
                ++year; // incrementa o ano.
            }
        }
        // retorna o incremento do dia sem exceções.
        return this;
    }

    /***
     * Atualiza o mês.
     * @return MyDate
     */

    public MyDate nextMonth(){
        /*
         De acordo com o enunciado da questão : Take note that nextMonth() for 31 Oct 2012 shall be 30 Nov 2012.
         Se o dia do mês anterior é igual ao limite para esse mês o dia do mês incrementado precisa ser o limite de
         dias para o mês incrementado.
         */
        // em ano bissexto Fevereiro tem um dia a mais.
        if(isLeapYear(year) && month == 2){
           int daysLeap = daysInMonths[month - 1] + 1; // armazena temporariamente os dias de Fevereiro em ano bissexto.
           if(day == daysLeap){ // verifica se no ano bissexto o mês de Fevereiro está no limite.
               day = daysInMonths[month + 1]; // põe os dias no limite de Março.
           }
        }

        if(day == daysInMonths[month - 1]){
            /*
            Se o mês for 11 ou 12 corremos o risco de acessar o índice de 12 ou 13 que ultrapassa
            o tamanho do vetor daysInMonths.
            O ano não ser bissexto e o mês 2, pois tem um if anterior para isso.
             */
            if (month < 11 || (!isLeapYear(year) && month == 2)){
                // põe os dias do próximo mês que vamos incrementar para o limite dos dias do mês incrementado.
                day = daysInMonths[month + 1];
            }
            if(month == 11){
                // acessa índice de Dezembro,pois no vetor 11 é o mês de Dezembro
                day = daysInMonths[month];
            }
        }
        ++month; // incrementa o mês.
        if (month > 12) { // verifica se o ano virou.
            month = 1; // como o ano virou estamos no primeiro mês
            day = daysInMonths[month - 1]; // atualiza os dias
            ++year;//incrementa o ano.
            return this;
        }
      return this;
    }
    /***
     * Atualiza o ano.
     * @return MyDate
     */
    public MyDate nextYear(){
        int daysLeap = daysInMonths[month - 1] + 1; // ano bissexto.
        ++year;
        // se o ano não for bissexto é preciso por o limite normal em Fevereiro.
        if(!isLeapYear(year) && month == 2){
            //se o dias para o ano anterior no mês doze eram 29 é porque estavamos em um ano bissexto.
            if(day == daysLeap){
                day = daysInMonths[month - 1];
            }
        }
        return this;
    }

    /***
     * Retorna o objeto do tipo MyDate com o regresso de um dia.
     * @return MyDate
     */
    public MyDate previousDay(){
        --day;
        // verifica se dia é menor que o limite 0 à 12.
        if(day <= 0){
            --month;
            // verifica se o mês que voltamos é Fevereiro.
            if(isLeapYear(year) && month == 2){
                // dias no limite do mês.
                day = daysInMonths[month - 1] + 1;
                return this;
            }
            // verifica se ultrapassou o limite de 12 à 0.
            if(month <= 0){
                month = 12 + month;
                /*
                Se ao regressar um mês temos zero é porque voltamos um ano.
                E é preciso por os dias no limite de Janeiro.
                 */
                day = daysInMonths[month - 1]; // atualiza o dia do mês.
                --year; // volta o ano.
                return this;
            }
            /*
            Exemplo : 01/02/2019 para 00/01/2019, teremos como 00 o limite para o mês de Janeiro.
             */
            day = daysInMonths[month - 1];
        }
        return this;
    }

    /***
     * Retorna um objeto do tipo MyDate com o regresso de um mês.
     * @return MyDate
     */
    public MyDate previousMonth(){
        --month; // decrementa o mês.
        // verifica se o ano é bissexto e estamos em Fevereiro.
        if(isLeapYear(year) && month == 2){
            // verifica se antes do mês Março ser decrementado os dias estavam no limite.
            if(day == daysInMonths[month]){
                // ano bissexto tem um dia a mais.
                day = daysInMonths[month - 1] + 1;
            }
            return this;
        }
        // verifica se ultrapassou o limite de 12 à 0.
        if(month <= 0){
                /*
                Atualiza o mês.
                Exemplo : 12/01/2015 mês anterior é 12 mas o decremento resulta em 0 então
                12 + 0 nos dá o mês real.
                Como o dia limite de Janeiro e Dezembro é igual então não é necessário exceção para esses meses.
                 */
            month = 12 + month;
            --year; // volta o ano.
            return this;
        }
        /*
         Take note that nextMonth() for 31 Oct 2012 shall be 30 Nov 2012.
         A diferença desse função para o nextMonth é no acesso aos índices.
         Quando usamos a variável month sem decrementar como índice estamos acessando o elemento do
         mês que não foi decrementado, ou seja, o mês "original".
         Enquanto ao usarmos month - 1 estamos acessando o elemento do mês decrementado.
         */
        if(day == daysInMonths[month]){
            day = daysInMonths[month - 1];
        }
        return this;
    }
    /***
     * Retorna um objeto do tipo MyDate com o regresso de um ano.
     * @return MyDate
     */
    public MyDate previousYear(){
        int daysLeap = daysInMonths[month - 1] + 1; // armazena os dias para o mês de Fevereiro em ano bissexto.
        --year;
        // verifica se o ano anterior não é bissexto e se está no mês dois para que os dias sejam de um Fevereiro normal.
        if(!isLeapYear(year) && month == 2){
            //Take note that nextMonth() for 31 Oct 2012 shall be 30 Nov 2012.
            //Verifica se o dia está no limite do mês no ano bissexto.
            /*
            28/02/2013 um ano antes é 29/02/2012 pois o ano é bissexto.
             */
            if(day == daysLeap){
                day = daysInMonths[month - 1] ;
            }
            return this;
        }
        return this;
    }
}

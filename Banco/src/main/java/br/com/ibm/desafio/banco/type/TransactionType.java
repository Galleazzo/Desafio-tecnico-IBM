package br.com.ibm.desafio.banco.type;

public enum TransactionType {

    CREDIT(0),
    DEBIT(1);

    private final int value;

    private TransactionType(int i){
        this.value=i;
    }

    public static TransactionType getByValue(Long i) {
        for(TransactionType dt : TransactionType.values()) {
            if(dt.value == i) {
                return dt;
            }
        }
        throw new IllegalArgumentException("no datatype with " + i + " exists");
    }
}

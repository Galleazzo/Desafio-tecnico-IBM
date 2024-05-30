export class Transaction {
    id!: number;
    type!: TransactionType;
    value!: number;
    date!: string;
    clientId!: number;
}

export enum TransactionType {
    DEBIT = 'DEBIT',
    CREDIT = 'CREDIT'
}
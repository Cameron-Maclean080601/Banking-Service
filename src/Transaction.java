import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * A class used to create a simple transaction
 *
 * <p>A transaction has an ID, date, description, category, amount,
 * and currency. IDs and amounts must be positive, and a description
 * must be supplied.
 * <p/>
 * Currency and category are backed by enums to ensure sensible inputs.
 */
public class Transaction{
    Integer id;
    LocalDate date;
    String description;
    Category category;
    BigDecimal amount;
    Currency currency;


    /**
     * Creates a new transaction.
     *
     * @param id          the unique positive ID of the transaction
     * @param date        the date of the transaction
     * @param description the description of the transaction
     * @param category    the category of the transaction
     * @param amount      the positive transaction amount
     * @param currency    the currency of the transaction
     */
    public Transaction (Integer id, LocalDate date, String description, Category category, BigDecimal amount, Currency currency)
    {

        if (id <= 0){
            throw new IllegalArgumentException("ID must be positive");
        }

        if (description.isEmpty()){
            throw new IllegalArgumentException("Transaction must contain description");
        }

        if (amount.compareTo(BigDecimal.ZERO) > 0){
            throw new IllegalArgumentException("Amount must be positive");
        }

        this.id = id;
        this.date = date;
        this.description = description;
        this.category=category;
        this.amount = amount;
        this.currency = currency;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }


}

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaction{

    Integer id;
    LocalDate date;
    String description;
    Category category;
    BigDecimal amount;
    Currency currency;

    public Transaction (Integer id, LocalDate date, String description, Category category, BigDecimal amount, Currency currency)
    {
        if (id <= 0){
            throw new IllegalArgumentException("ID must be positive");
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

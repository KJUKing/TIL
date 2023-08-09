# Write your code here:
def get_yearly_revenue(money):
    revenue_for_a_year = money * 12
    return revenue_for_a_year

def get_yearly_expenses(cost):
    expenses_for_a_year = cost * 12
    return expenses_for_a_year

def get_tax_amount(profit):
    if profit > 100000 :
        return profit * 0.25
    else :
        return profit * 0.15

def apply_tax_credits(a, b):
    amount_to_discount = a * b
    return amount_to_discount

# Don't touch anthing below this line 🙅🏻‍♂️🙅🏻‍♀️

monthly_revenue = 5500000
monthly_expenses = 2700000
tax_credits = 0.01

profit = get_yearly_revenue(monthly_revenue) - get_yearly_expenses(monthly_expenses)

tax_amount = get_tax_amount(profit)

final_tax_amount = tax_amount - apply_tax_credits(tax_amount, tax_credits)

print(f"Your tax bill is: ${final_tax_amount}")


"""
Consider a showroom of electronic products, where there are various salesmen. Each
salesman is given a commission of 5%, depending on the sales made per month. In case
the sale done is less than 50000, then the salesman is not given any commission. Write
a function to calculate total sales of a salesman in a month, commission and remarks
for the salesman. Sales done by each salesman per week is to be provided as input.
Assign remarks according to the following criteria:
Excellent: Sales >=80000
Good: Sales>=60000 and <80000
Average: Sales>=40000 and <60000
Work Hard: Sales < 40000
"""

def eval_commisions(total_sales:float) -> float:
    if total_sales > 50_000:
        return 0.05 * total_sales
    else:
        return 0

def eval_remark(total_sales:float) -> str:
    if total_sales >= 80_000:
            return "Excellent"
    elif 60_000 <= total_sales < 80_000:
        return "Good"
    elif 40_000 <= total_sales < 60_000:
        return "Average"
    else:
        return "Work Hard"

def get_sales_details(sales_per_week:float) -> dict:
    total_sales = sum(sales_per_week)

    commission = eval_commisions(total_sales)

    remark = eval_remark(total_sales)

    return {
        "total_sales": total_sales,
        "commisions": commission,
        "remark": remark,
    }


def print_sales_details(sales_details:dict) -> None:
    for key, value in sales_details.items():
        print(key, ':', value)


sales_per_week = []

for i in range(4):
    sale = float(input(f"Sale for week {i + 1}: "))
    sales_per_week.append(sale)

sales_details = get_sales_details(sales_per_week)
print_sales_details(sales_details)


"""
Sale for week 1: 10000
Sale for week 2: 20000
Sale for week 3: 30_000
Sale for week 4: 10000
total_sales : 70000.0
commisions : 3500.0
remark : Good
"""


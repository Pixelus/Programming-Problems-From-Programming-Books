def make_car(manufacturer, model_name, **options):
    """Build a dictionary containing everything we know about a car."""
    car = {}
    car['manufacturer'] = manufacturer
    car['model'] = model_name
    for key, value in options.items():
        car[key] = value
    return car

user_car = make_car("subaru", "outback", color="blue", tow_package=True)
print(user_car)

fruit_shop = {
    "apple": 300,
    "banana": 100,
    "orange": 200,
    "peaches": 150
}

key_to_check = input("What fruit are you looking for? ").lower()

if(key_to_check in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")
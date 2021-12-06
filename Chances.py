import random
from time import sleep

# Nyimip : "Intinya, 1 barang yang diinginkan dari entah sekian banyak. Terus-terusan dicoba sampai dapat. Posisi barangnya tetap sama."
def one_thing(items):
    # one item from... many, many things
    items = int(items)
    wish = random.randint(1, items)
    print("Wish's location number: %s" % (wish))
    chance = random.randint(1, items)
    print("The number we get: %s" % (chance))
    tries = 1

    while(chance != wish):
        chance = random.randint(1, items)
        print("The number we get: %s" % (chance))
        tries += 1

    print("Trials count: %s" % (tries))

# Nyimip : "Barang yang diinginkan pindah-pindah urutannya."
def randomize(items, times):
    # one item that keeps moving 'round and 'round
    items = int(items)
    times = int(times)
    wish = random.randint(1, int(items))
    print("Wish's location number: %s"% (wish))
    chance = random.randint(1, items)
    print("The number we get: %s"% (chance))

    for index in range(times - 1):
        if chance != wish:
            wish = random.randint(1, items)
            print("Wish's location number: %s"% (wish))
            chance = random.randint(1, items)
            print("The number we get: %s"% (chance))
        elif chance == wish:
            print("Congratz! :D")
            break
    else:
        print("You lose :p")

# Nyimip: "Selangka apa barang yang didapat. Urutan barang berubah-ubah (100), percobaan bebas berapa kali."
def get(times):
    # Rarity based summoning chance
    # based on VC
    times = int(times)
    chance = 0
    n =0
    r = 0
    sr = 0
    ur = 0
    lr = 0
    
    for index in range(times):
        chance = random.randint(0, 99)
        if chance < 50:
            print("Normal")
            n += 1
        elif chance < 75:
            print("Rare")
            r += 1
        elif chance < 90:
            print("Super Rare")
            sr += 1
        elif chance < 99:
            print("Ultra Rare")
            ur += 1
        elif chance == 99:
            print("Legendary Rare")
            lr += 1

    print("Ratio:\nNormal: %s\nRare: %s\nSuper Rare: %s\nUltra Rare: %s\nLegendary Rare: %s" % (n, r, sr, ur, lr))

# Nyimip: "Toram style; tidak ada kepastian mobs yang mana."
def Toram(times):
    # several steps roulette
    # based on TO
    times = int(times)
    first(times)
def first(times):
    for index in range(times):
        chance1 = random.randint(0, 99)
        if chance1 < 50:
            print("Nothing")
        elif chance1 < 70:
            print("Common Item 1")
        elif chance1 < 90:
            print("Common Item 2")
        elif chance1 < 100:
            second(times)      
def second(times):
    chance2 = random.randint(0, 99)
    if chance2 < 50:
        first(times)
    elif chance2 < 70:
        print("Rare Item 1")
    elif chance2 < 90:
        print("Rare Item 2")
    elif chance2 < 100:
        third(times)
def third(times):
    chance3 = random.randint(0, 99)
    if chance3 < 50:
        first(times)
    elif chance3 < 70:
        print("Super Rare Item 1")
    elif chance3 < 90:
        print("Super Rare Item 2")
    elif chance3 < 100:
        print("Xtal")

# NYimip: "Drop rate Xtals per bosses' difficulty tanpa efek luck dan booster books."
def Xtal(times):
    # very spesific drop without boosting
    # based on TO
    times = int(times)
    xtal = 0
    print("Difficulty:\n1. Normal\n2. Hard\n3. Nightmare\n4. Ultimate")
    diff = input("Enter the difficulty number: ")
    
    for index in range(times):
        chance = random.randint(1, 100000)
        if diff == "1" and chance < 9:
            print("Congratz! You get an Xtal!")
            xtal += 1
        elif diff == "2" and chance < 17:
            print("Congratz! You get an Xtal!")
            xtal += 1
        elif diff == "3" and chance < 32:
            print("Congratz! You get an Xtal!")
            xtal += 1
        elif diff == "4" and chance < 64:
            print("Congratz! You get an Xtal!")
            xtal += 1
        else:
            print("Soooorryyy~ better luck next time ;)")
    
    print("Total Xtals: %s" % (xtal))
    
seconds = 5
trying = True
items = 0
times = 0

try:
    while trying:
        print("\n===== WELCOME TO CHANCE GENERATOR! ======")
        print("1. One item from several items with the same ratio (keep trying untill you get it)\n2. One item from a shuffled list of items (10 times)\n3. Summoning rarity ratio\n4. Toram Style\n5. Xtal\n6. Quit")
        print("\nNyimip:\n1. Satu barang dari sekian barang yang ada, rasio kesempatan sama (sampai dapat)\n2. Satu barang dari sekian barang yang terus diacak (hanya 10 kali percobaan)\n3. Gacha dengan berbeda-beda kelangkaan\n4. Taulah kaya apa XD\n5. Xtal drop rate tanpa tambahan luck maupun buku-buku\n6. Keluar")
        choice = input("\nEnter the number: ")
        if choice == "1":
            items = input("Enter the sum of the items in list: ")
            one_thing(items)
            sleep(seconds)
        elif choice == "2":
            items = input("Enter the sum of the items list: ")
            times = input("Enter the number of trials: ")
            randomize(items, times)
            sleep(seconds)
        elif choice == "3":
            times = input("Enter the number of trials: ")
            get(times)
            sleep(seconds)
        elif choice == "4":
            times = input("Enter the number of spins: ")
            Toram(times)
            sleep(seconds)
        elif choice == "5":
            times = input("Enter the number of trials: ")
            Xtal(times)
            sleep(seconds)
        elif choice == "6":
            print("Goodbye, have a nice day! ^-^")
            trying = False
        else:
            print("Please enter the number within the range of the options.")
except ValueError:
    print("Please enter only the number.")
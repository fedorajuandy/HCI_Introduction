import tkinter
import random
from time import sleep
from threading import Thread

root = tkinter.Tk()
canvas1 = tkinter.Canvas(root, width = 1000, height = 600)
root.title("Chance Simulator")
canvas1.pack()

# Nyimip : "Intinya, 1 barang yang diinginkan dari entah sekian banyak. Terus-terusan dicoba sampai dapat. Posisi barangnya tetap sama."
label_onething = tkinter.Label(root, text = "++ Try 'till You Get It ++", fg = "black", font = ("helvetica", 20))
label0_onething = tkinter.Label(root, text = "Enter the sum of the items in list: ", fg = "black", font = ("helvetica", 12), justify = "left")
labels_onething = []
i = tkinter.Entry(root, width = 10, font = ("helvetica", 14))
button0_onething = tkinter.Button(root, text = "Back", command = lambda: Thread(target=back1).start(), bg = "blue", fg = "white")
button1_onething = tkinter.Button(root, text = "OK", command = lambda: Thread(target = one_thing1(i.get())).start(), bg = "blue", fg = "white")
        
def one_thing():
    # one item from... many, many things
    items = 0
    removal()
    canvas1.create_window(500, 50, window = label_onething)
    canvas1.create_window(225, 100, window = label0_onething)
    try:
        canvas1.create_window(200, 150, window = i)
        canvas1.create_window(275, 150, window = button1_onething)
    except:
        canvas1.create_window(500, 300, window = labelx)

def one_thing1(stritems):
    labelx.destroy()
    try:
        items = int(stritems)
        wish = random.randint(1, items)
    except:
        canvas1.create_window(500, 300, window = labelx)
    labelx.destroy()
    label1 = tkinter.Label(root, text = "Wish's location number: %s" % (wish), fg = "black", font = ("helvetica", 12), justify = "left")
    labels_onething.append(label1)
    canvas1.create_window(225, 200, window = label1)
    chance = random.randint(1, items)
    label2 = tkinter.Label(root, text = "The number we get: %s" % (chance), fg = "black", font = ("helvetica", 12), justify = "left")
    labels_onething.append(label2)
    canvas1.create_window(425, 100, window = label2)
    tries = 1
    y = 150

    while(chance != wish):
        chance = random.randint(1, items)
        label2 = tkinter.Label(root, text = "The number we get: %s" % (chance), fg = "black", font = ("helvetica", 12))
        canvas1.create_window(425, y, window = label2)
        labels_onething.append(label2)
        tries += 1
        y += 50

    label3 = tkinter.Label(root, text = "Trials count: %s" % (tries), fg = "black", font = ("helvetica", 12))
    canvas1.create_window(425, y + 50, window = label3)
    labels_onething.append(label3)
    canvas1.create_window(500, y + 100, window = button0_onething)
    
def back1():
    label_onething.destroy()
    label0_onething.destroy()
    button0_onething.destroy()
    button1_onething.destroy()
    for label in labels_onething:
        label.destroy()
    main()

# Nyimip : "Barang yang diinginkan pindah-pindah urutannya."
def randomize():
    # one item that keeps moving 'round and 'round
    items = input("Enter the sum of the items list: ")
    times = input("Enter the number of trials: ")
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
def get():
    # Rarity based summoning chance
    # based on VC
    times = input("Enter the number of trials: ")
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
def Toram():
    # several steps roulette
    # based on TO
    times = input("Enter the number of spins: ")
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
    root.destroy()
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
def Xtal():
    # very spesific drop without boosting
    # based on TO
    times = input("Enter the number of trials: ")
    times = int(times)
    print("Difficulty:\n1. Normal\n2. Hard\n3. Nightmare\n4. Ultimate")
    diff = input("Enter the difficulty number: ")
    
    for index in range(times):
        chance = random.randint(1, 100000)
        if diff == "1" and chance < 9:
            print("Congratz! You get an Xtal!")
        elif diff == "2" and chance < 17:
            print("Congratz! You get an Xtal!")
        elif diff == "3" and chance < 32:
            print("Congratz! You get an Xtal!")
        elif diff == "4" and chance < 64:
            print("Congratz! You get an Xtal!")
        else:
            print("Soooorryyy~ better luck next time ;)")

def main():
    canvas1.create_window(500, 50, window = labela)
    canvas1.create_window(375, 150, window = labelb)
    canvas1.create_window(400, 285, window = labelc)
    canvas1.create_window(500, 420, window = labeld)
    canvas1.create_window(400, 450, window = buttona)
    canvas1.create_window(450, 450, window = buttonb)
    canvas1.create_window(500, 450, window = buttonc)
    canvas1.create_window(550, 450, window = buttond)
    canvas1.create_window(600, 450, window = buttone)
    canvas1.create_window(500, 500, window = buttonf)
    canvas1.create_window(500, 550, window = labele)

def out():
    removal()
    label0 = tkinter.Label(root, text = "Goodbye, have a nice day! ^-^", fg = "black", font = ("helvetica", 24))
    canvas1.create_window(500, 300, window = label0)
    sleep(3)
    root.destroy()

def removal():
    labela.destroy()
    labelb.destroy()
    labelc.destroy()
    labeld.destroy()
    labele.destroy()
    buttona.destroy()
    buttonb.destroy()
    buttonc.destroy()
    buttond.destroy()
    buttone.destroy()
    buttonf.destroy()

trying = True
items = 0
times = 0

labela = tkinter.Label(root, text = "===== WELCOME TO CHANCE GENERATOR! ======", fg = "black", font = ("helvetica", 24))
labelb = tkinter.Label(root, text = "1. One item from several items with the same ratio (keep trying untill you get it)\n2. One item from a shuffled list of items (10 times)\n3. Summoning rarity ratio\n4. Toram Style\n5. Xtal\n6. Quit", fg = "black", font = ("helvetica", 12), justify = "left")
labelc = tkinter.Label(root, text = "NYIMIP:\n1. Satu barang dari sekian barang yang ada, rasio kesempatan sama (sampai dapat)\n2. Satu barang dari sekian barang yang terus diacak (hanya 10 kali percobaan)\n3. Gacha dengan berbeda-beda kelangkaan\n4. Taulah kaya apa XD\n5. Xtal drop rate tanpa tambahan luck maupun buku-buku\n6. Keluar", fg = "black", font = ("helvetica", 12), justify = "left")
labeld = tkinter.Label(root, text = "Pick a number: ", fg = "black", font = ("helvetica", 16))
labele = tkinter.Label(root, text = "^-^ NYIMIP ^-^", fg = "black", font = ("helvetica", 18))
labelx = tkinter.Label(root, text = "Please enter a number.", fg = "red", font = ("helvetica", 14))
buttona = tkinter.Button(root, text = "1", command = lambda: Thread(target=one_thing).start(), bg = "blue", fg = "white")
buttonb = tkinter.Button(root, text = "2", command = lambda: Thread(target=randomize).start(), bg = "blue", fg = "white")
buttonc = tkinter.Button(root, text = "3", command = lambda: Thread(target=get).start(), bg = "blue", fg = "white")
buttond = tkinter.Button(root, text = "4", command = lambda: Thread(target=Toram).start(), bg = "blue", fg = "white")
buttone = tkinter.Button(root, text = "5", command = lambda: Thread(target=Xtal).start(), bg = "blue", fg = "white")
buttonf = tkinter.Button(root, text = "out", command = lambda: Thread(target=out).start(), bg = "blue", fg = "white")

main()

root.mainloop()
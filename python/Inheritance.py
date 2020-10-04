class Box:
  )  def __init__(self):
        self.width = int(input("Enter Width : "))
        self.height = int(input("Enter Height : "))
        self.depth = int(input("Enter Depth : "))


class Volume(Box):
    def __init__(self):
        Box.__init__(self)
        self.volume = self.width * self.height * self.depth


obj2 = Volume()
print(obj2.volume

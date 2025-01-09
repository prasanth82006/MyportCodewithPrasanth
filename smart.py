# age=10
# name='Prasanth'
# exp=2.5
# emp=True
# # print(age,name,exp,emp)
# print(type(name))

# i=0
# while(i<5):
#      print(i)
#      i+=1

# List
# a=[1,2,3,4,"list"]
# a.append(34)
# print(a)

#Tuples
# t=(1,2,3,4,5)
# print(t)

# dictionaries
# d={1:"name",2:"age"}
# d[1]="he"
# print(d)

# Functions
# def func1(name):
#      print(f"Welcome to {name}")
# func1("Prasanth")

# Class
# class Demo:
#      # def __init__(self):
#      #      self.name=name
#      def func2(self,name):
#           print("Welcome")
# o=Demo()
# o.func2("welcome")


# Calculator
# class calc:
#      def __init__(self):
#           self.a=0
#           self.b=0
#      def get_input(self):
#           while(True):
#                try:
#                     self.a=float(input("ENter the First number"))
#                     self.b=float(input("ENter the Second number"))
#                     return
#                except ValueError:
#                     print("Please Enter the valid Number")
#      def add(self):
#           return self.a+self.b
#      def subtract(self):
#           return self.a-self.b
#      def mutiple(self):
#           return self.a*self.b
#      def division(self):
#           try:
#                return self.a/self.b
#           except ZeroDivisionError:
#                return "Cannot divide by 0"

# cal=calc()
# while(True):
#      print("Select The option: ")
#      print("1 for Addition")
#      print("2 for Subtraction")
#      print("3 for Mutiplication")
#      print("4 for Division")
#      s=input("Enter the Choice")
#      if s in ('1','2','3','4'):
#           cal.get_input()
#           if(s=='1'):
#                print(cal.add())
#           elif(s=='2'):
#                print(cal.subtract())
#           elif(s=='3'):
#                print(cal.mutiple())
#           elif(s=='4'):
#                print(cal.division())
#      else:
#           print("Enter the the provided Options only")
#      c=int(input("Do you want to continue 1 for yes/0 for no:"))
#      if(c==0):
#           break

# import numpy as np
# arr=np.array([1,2,3,4])
# print(arr)
# mean=np.mean(arr)
# print(mean)
# r=arr.reshape(4,1)
# print(r)
# arr2=np.array([5,6,7,8])
# result=arr*arr2
# print(result)
# m=np.max(arr2)
# print(m)


# import pandas as pd
# df=pd.read_csv('data.csv')
# print(df)

import seaborn as sn
import numpy as np
data=np.random.randn(100)
sn.histplot(data=data,bins=10)



























































































# Examples

# a=input("Enter the number 1: ")
# b=input("Enter the number 2: ")
# c=int(a)+int(b)
# print(c)

# name="prasanth"
# print(name.capitalize())

# a={1,2,3,4}
# print(a)

# class Student:
#      def __init__(self,name,m1,m2,m3):
#           self.name=name
#           self.m1=m1
#           self.m2=m2
#           self.m3=m3
#      def average(self):
#           avg=(self.m1+self.m2+self.m3)/3
#           return avg
# s1=Student("Prasanth",12,78,98)
# print(s1.average())

# import math
# class Circle:
#      def __init__(self,radius):
#           self.radius=radius
#      def Area(self):
#           area=math.pi*(self.radius**2)
#           print(area)
#      def Perimeter(self):
#           perimeter=2*math.pi*self.radius
#           print(perimeter)

# c=Circle(21)
# c.Area()
# c.Perimeter()



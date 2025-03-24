class MyCircularQueue(object):

    def __init__(self, k):
        """
        :type k: int
        """
        self.q=[None]*k
        self.k=k
        self.front=-1
        self.rear=-1
        

    def enQueue(self, value):
        """
        :type value: int
        :rtype: bool
        """
        if self.isFull():
            return False
        if self.front==-1:
            self.front=self.rear=0
            self.q[self.rear]=value
            return True
        self.rear=(self.rear+1)%self.k
        self.q[self.rear]=value
        return True
        

    def deQueue(self):
        """
        :rtype: bool
        """
        if self.front==-1:
            return False
        self.q[self.front]=None
        if self.front==self.rear:
            self.front=-1
            self.rear=-1
        else:
            self.front=(self.front+1)%self.k
        return True

        

    def Front(self):
        """
        :rtype: int
        """
        if self.front==-1:
            return -1
        return self.q[self.front]
        

    def Rear(self):
        """
        :rtype: int
        """
        if self.rear==-1:
            return -1
        return self.q[self.rear]
        

    def isEmpty(self):
        """
        :rtype: bool
        """
        return self.front==-1
        

    def isFull(self):
        """
        :rtype: bool
        """
        return (self.rear+1)%self.k==self.front
        



//https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1#

class Meeting {
    int start,end,pos;
    Meeting(int start, int end, int pos)
    {
        this.start=start;
        this.end = end;
        this.pos = pos;
    }
}
class MeetingComparator implements Comparator<Meeting>
{
    
    public int compare (Meeting o1, Meeting o2)
    {
        if(o1.end<o2.end)
        {
            return -1;
        }
        if(o1.end>o2.end)
        {
            return 1;
        }
        if(o1.pos<o2.pos)
        {
            return -1;
        }
        return 1;
    }
}
class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
       ArrayList<Meeting> meet = new ArrayList<>();
       for(int i=0;i<start.length;i++)
       {
           meet.add(new Meeting(start[i],end[i],i+1));
       }
       MeetingComparator mc = new MeetingComparator();
       Collections.sort(meet,mc);
       ArrayList<Integer>ans = new ArrayList<>();
       ans.add(meet.get(0).pos);
       int limit = meet.get(0).end;
       for(int i=1;i<start.length;i++)
       {
           if(meet.get(i).start>limit)
           {
               limit = meet.get(i).end;
               ans.add(meet.get(i).pos);
           }
       }
       return ans.size();
    }
}

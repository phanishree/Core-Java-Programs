package javaMain;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;
public class MiniMusicCmdLine{ // this is the first one
public static void main (String[] args) throws Exception{
MiniMusicCmdLine mini = new MiniMusicCmdLine ();
int a=30,b=80;
while(a<60&&b<120) {
if(a<4)
System. out.println ("Don' t forget the instrument and note args");
else {
int instrument =  a;                                  //Integer .parseInt("37");
int note = b;                                       // Integer . parseInt ("79");
mini.play(instrument, note);

Thread.sleep(500);
a++;
b++;
}
}
}//close main
public void play (int instrument , int note) {
try {
Sequencer player =MidiSystem. getSequencer();
player . open ();
Sequence seq= new Sequence(Sequence. PPQ, 4);
Track track =seq.createTrack();
MidiEvent event = null;
ShortMessage first= new ShortMessage();
first.setMessage (192,1, instrument, 0);
MidiEvent changeInstrument= new MidiEvent (first, 1);
track. add (changeInstrument);
ShortMessage a= new ShortMessage () ;
a.setMessage (144, 1,note, 100); 
MidiEvent noteon =new MidiEvent (a, 1);
track. add (noteon) ; 
ShortMessage b =new ShortMessage ();
b. setMessage(128,1,note,100);
MidiEvent noteoff =new MidiEvent (b, 16);
track. add (noteoff) ; 
player. setSequence (seq);
player. start ();
}
catch (Exception ex) {}
}
}
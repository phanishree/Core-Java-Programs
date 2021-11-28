package javaMain;

import javax.sound.midi. *; // Don't forget to import the mid
public class midiMusicPlayer {
public static void main (String [] args) {
	midiMusicPlayer mini = new midiMusicPlayer ();
mini.play ();
} // close main
public void play () {
try {
 Sequencer player = MidiSystem.getSequencer ();
player.open ();

Sequence seg= new Sequence (Sequence. PPQ, 4);
Track track=seg.createTrack ();

ShortMessage a = new ShortMessage  ();
a.setMessage (144, 1, 14, 100);
MidiEvent noteOn= new MidiEvent (a, 1); 
track.add (noteOn ); 
ShortMessage b=new ShortMessage ();
a.setMessage(144,1,44,100);
MidiEvent noteOff=new MidiEvent(b,16);
track.add(noteOff);
player.setSequence (seg);
player.start (); 
} catch (Exception ex) {
ex.printStackTrace(); 
} // close play
} // close class
}
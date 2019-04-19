# music-night

A demo of object oriented programming in Java. 

The project simulates bands playing during multiple nights, with members leaving and joining bands each session. Specifically, each night all members currently not in a band tries to join a band, and at the end of the night one random member from each band leaves. This could be the same member that just joined (that person's performance didn't quite hit the mark).


## Implementation

We make extensive use of has-a relations between our classes. Specifically, each Band has a name and a list of members (Musician); each Musician has a name and an instrument; and each Instrument has a type, a manufacturer and a list of properties. A property (InstrumentProperty) is virtually a String, but is implemented as a class to enable future additions. The instrument's type (InstrumentType) is also a class, which can only be instantiated using a factory method. This was to prevent failed comparisons between instrument types due to typos or different spellings. An alternative would have been to use subclasses, which could have the upside of facilitating extension, but was ultimately deemed unnecessary for this small project.

Bands, musicians and instruments can be instantiated using the constructors, or alternatively using the provided factory classes. These create bands etc. specific to this assignment, and are thus not usable for a general case. However, it comes with the benefit that in order to have more bands, one need simply add more band-creating methods.

The MusicNightRunner acts as the engine for the simulation; it provides public methods for listing all bands, with members and instrument information (by overriding toString) and simulating one night. The latter works by looping through all musicians not in a band and attempting to add them to a random band. This will fail if the band already has a member with an instrument of the same type - the musician would then remain without a band. The second step is that each band loses one member at random. All changes are then printed, using a StringBuilder change log.

Finally, the main function is in the App class, which provides a terminal interface to the user, who can choose to 1. List all bands, 2. Play one night, or 3. Exit.


## Run instructions

The code is tested on Java 8 and Java 12. To run the app from terminal, assuming you start in the project root, do the following:

```
$ cd src/main/java
$ javac app/*.java
$ java app.App
```


## Example run

Below is an example run. Note that yours might not give the exact same result, as there is randomness in what member leaves and what bands musicians join.

```
What do you want to do? 
	 1: List all bands
	 2: Play one night
	 3: Exit
1
Musicians not in band: 
	* Musician Rita Linter playing Ukulele (Manufacturer: Brick, Number of strings: 7, String size: 1.2mm)
Band Frayrats with members:
	* Musician Stringsteen playing Banjo (Manufacturer: Gibson, Number of strings: 4, String size: 8mm)
	* Musician Zindea playing Drums (Manufacturer: Toyota, Has hi-hat)
	* Musician Captor playing Synthesizer (Manufacturer: Suzuki, Number of keys: 72, Has no LED)
Band Weekend Skaters with members:
	* Musician Hazy Baar playing Guitar (Manufacturer: Bender, Number of strings: 5, String size: 0.4mm)
	* Musician Beatwin playing Piano (Manufacturer: Bender, Number of keys: 51, Is acoustic)
	* Musician The Void playing Synthesizer (Manufacturer: Lorg, Number of keys: 47, Has LED)

What do you want to do? 
	 1: List all bands
	 2: Play one night
	 3: Exit
2
Rita Linter joined Frayrats
Stringsteen left Frayrats
Hazy Baar left Weekend Skaters

What do you want to do? 
	 1: List all bands
	 2: Play one night
	 3: Exit
1
Musicians not in band: 
	* Musician Stringsteen playing Banjo (Manufacturer: Gibson, Number of strings: 4, String size: 8mm)
	* Musician Hazy Baar playing Guitar (Manufacturer: Bender, Number of strings: 5, String size: 0.4mm)
Band Frayrats with members:
	* Musician Zindea playing Drums (Manufacturer: Toyota, Has hi-hat)
	* Musician Captor playing Synthesizer (Manufacturer: Suzuki, Number of keys: 72, Has no LED)
	* Musician Rita Linter playing Ukulele (Manufacturer: Brick, Number of strings: 7, String size: 1.2mm)
Band Weekend Skaters with members:
	* Musician Beatwin playing Piano (Manufacturer: Bender, Number of keys: 51, Is acoustic)
	* Musician The Void playing Synthesizer (Manufacturer: Lorg, Number of keys: 47, Has LED)

What do you want to do? 
	 1: List all bands
	 2: Play one night
	 3: Exit
3
Exiting
```

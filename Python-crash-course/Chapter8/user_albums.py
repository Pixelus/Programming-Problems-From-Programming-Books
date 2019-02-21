def make_album(artist_name, album_title, tracks_number = ''):
    music_album = {'artist': artist_name, 'album': album_title}
    if tracks_number:
        music_album['tracks'] = tracks_number
    print(music_album)

make_album("Jimi Hendrix", "Gandja")
make_album("Dido", "I know")
make_album("Blur", "Stop me")
make_album("Johnny Hallyday", "Sur la route", 13)

while True:
    artist = input("Enter an album'artist: ")
    album = input("Enter the title of this album: ")
    make_album(artist, album)
    quit_or_not = input("Enter 'q' for quit or 'c' for continue.")
    if quit_or_not == 'q':
        break

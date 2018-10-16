# AndroidTVHandleFocus

### Test default focus
**Don't handle focus programmatically (leave default and just add some log for debug) (DefaultFocusActivity)

Focus Button1 by press key down
```
MainActivity: btn1 action up
MainActivity: btn1 key pad down
```
Focus Button2 by press key down (both key event in btn1 and btn2 fired)
```
MainActivity: btn1 action down
MainActivity: btn1 key pad down
MainActivity: btn2 action up
MainActivity: btn2 key pad down
```
From Button2 press key down (4 event will fired for `btn2` because there is no more view)
```
MainActivity: btn2 action down
MainActivity: btn2 key pad down
MainActivity: btn2 action up
MainActivity: btn2 key pad down
```

### Test custom focus (MainActivity)

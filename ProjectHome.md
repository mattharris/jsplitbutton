A simple implementation of the split button control in Java. This control raises two events.
  1. buttonClicked(e)
  1. splitButtonClicked(e)

The buttonClicked event is raised when the button is clicked, the left part, which will not trigger the dropdown menu. Whereas the splitButtonClicked event is raised when the split part of the button is clicked and displays a popup menu.

To handle these events you need to subscribe to SplitButtonActionListener.

Checkout [Swing Components](https://code.google.com/p/swing-components/) for more swing controls


**Screenshots**

![http://4.bp.blogspot.com/_cEtIZPdSTf0/TO1UYDOiJFI/AAAAAAAAANI/Js2Dq_rplO4/s1600/JSplitButton-GTK.png](http://4.bp.blogspot.com/_cEtIZPdSTf0/TO1UYDOiJFI/AAAAAAAAANI/Js2Dq_rplO4/s1600/JSplitButton-GTK.png)

![http://2.bp.blogspot.com/_cEtIZPdSTf0/TO1UpqVznOI/AAAAAAAAANM/QFelpE5Zabs/s1600/JSplitButton-Nimbus.png](http://2.bp.blogspot.com/_cEtIZPdSTf0/TO1UpqVznOI/AAAAAAAAANM/QFelpE5Zabs/s1600/JSplitButton-Nimbus.png)

**Using the Control:**
```
//first instantiate the control
JSplitButton splitButton = new JSplitButton();
//register for listener
splitButton.addSplitButtonActionListener(new SplitButtonActionListener() {

            public void buttonClicked(ActionEvent e) {
System.out.println("Button Clicked");
            }

            public void splitButtonClicked(ActionEvent e) {
System.out.println("Split Part licked");
            }
        });
//add popup menu
splitButton.add(popupMenu);
//add this control to panel
panel.add(splitButton);
```

**Known Issue:**

<s>The 'button part' of the splitbutton is being drawn without the border??? and this is only happening in CDE/Motif and Metal Look and Feels.GTK+ and nimbus works perfect. No Idea why? if anybody could point out the mistake that'd be nice.</s> This has been fixed by Hervé Guillaume

![http://4.bp.blogspot.com/_cEtIZPdSTf0/TPLDcji2tuI/AAAAAAAAANQ/wEVavt_1mTk/s1600/JSplitButton-Metal.png](http://4.bp.blogspot.com/_cEtIZPdSTf0/TPLDcji2tuI/AAAAAAAAANQ/wEVavt_1mTk/s1600/JSplitButton-Metal.png)
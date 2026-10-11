.class public final synthetic Lax/u0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$DurationScaleChangeListener;


# instance fields
.field public final synthetic a:Lax/u0/c$d;


# direct methods
.method public synthetic constructor <init>(Lax/u0/c$d;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/u0/f;->a:Lax/u0/c$d;

    return-void
.end method


# virtual methods
.method public final onChanged(F)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/u0/f;->a:Lax/u0/c$d;

    invoke-static {v0, p1}, Lax/u0/c$d;->c(Lax/u0/c$d;F)V

    return-void
.end method
